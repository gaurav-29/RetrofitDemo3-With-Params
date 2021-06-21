package com.example.retrofitdemo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    //String url = "https://simplifiedcoding.net/demos/";
    APIInterface apiInterface;
    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        tv.setText("");

        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<TestModel> call = apiInterface.getUsers(Integer.parseInt("2"));

        call.enqueue(new Callback<TestModel>() {
            @Override
            public void onResponse(Call<TestModel> call, Response<TestModel> response) {

                //Toast.makeText(ctx, response.code(), Toast.LENGTH_LONG).show();
                Log.d("BHAV", response.body().toString());

                TestModel userList = response.body();
                int page = userList.page;
                int total = userList.total;
                int totalPages = userList.total_pages;
                List<TestModel.Data> dataList = userList.data;
                Toast.makeText(ctx, page + " page\n" + total + " total\n" + totalPages + " totalPages\n", Toast.LENGTH_LONG).show();

                for(int i=0; i<dataList.size();i++)
                    tv.append("ID:"+dataList.get(i).id+ "\n First Name :"+dataList.get(i).first_name+" \n Last Name :"+dataList.get(i).last_name+ "\n Avatar :" + dataList.get(i).avatar + "\n\n\n");
//                for (TestModel.Data data : dataList) {
//                    Toast.makeText(ctx, "id : " + data.id + " name: " + data.first_name + " " + data.last_name + " avatar: " + data.avatar, Toast.LENGTH_LONG).show();
//                }
            }

            @Override
            public void onFailure(Call<TestModel> call, Throwable t) {
                //call.cancel();
                Toast.makeText(ctx, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
   }

}
