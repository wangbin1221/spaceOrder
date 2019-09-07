package com.example.imeeting.modules.homepage.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * description:
 * created by wangbin on 2019/6/5
 */
public class OrderFragment extends Fragment {
    public static OrderFragment newInstance(Bundle bundle){
        assert (bundle!= null);
        OrderFragment fragment = new OrderFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

}
