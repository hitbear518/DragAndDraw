package me.senwang.draganddraw;

import android.app.Fragment;


public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new DragAndDrawFragment();
    }
}
