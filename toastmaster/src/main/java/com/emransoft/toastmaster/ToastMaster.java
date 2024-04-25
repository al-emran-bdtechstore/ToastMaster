package com.emransoft.toastmaster;

import android.content.Context;
import android.widget.Toast;

public class ToastMaster {
    public static void ShowToast(Context context, String Message) {
        Toast.makeText(context, Message, Toast.LENGTH_SHORT).show();
    }
}
