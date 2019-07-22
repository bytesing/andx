package com.bytesing.impl.view;

import android.content.Context;

import com.bytesing.andx.mvp.ipresenter.IAxPresenter;
import com.bytesing.andx.mvp.iview.IAxContentView;

public class AxDemoContentView implements IAxContentView<IAxPresenter> {

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public boolean isInvalid() {
        return false;
    }

    @Override
    public void setPresenter(IAxPresenter presenter) {

    }
}
