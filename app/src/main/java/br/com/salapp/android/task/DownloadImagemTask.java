package br.com.salapp.android.task;

import android.media.Image;
import android.os.AsyncTask;

/**
 * Created by jordan.silva on 02/05/2016.
 */
public class DownloadImagemTask extends AsyncTask<String, String, Image> {
    @Override
    protected void onPreExecute() {
        //Here you can show progress bar or something on the similar lines.
        //Since you are in a UI thread here.
        super.onPreExecute();
    }

    protected void onPostExecute(String values) {
        //After completing execution of given task , control will return here.
        //Hence if you want to populate UI elements with fetched data, do it here
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        // You can track you progress update here
    }


    @Override
    protected Image doInBackground(String... url) {
        // Here you are in the worker thread and you are not allowed to access UI thread from here
        //Here you can perform network operations or any heavy operations you want.
        return null;
    }
}
