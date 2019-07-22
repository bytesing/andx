/*
 * Created by <a href="mailto:bytesing.inc@gmail.com">bytesing.inc</a> on 7/23/19 12:20 AM.
 * Copyright (c) 2019 <a href="mailto:bytesing.inc@gmail.com">bytesing.inc.</a> All rights reserved.
 */

package com.bytesing.andx.mvp.iview;

import android.content.Context;

import com.bytesing.andx.mvp.check.IAxInvalidChecker;
import com.bytesing.andx.mvp.ipresenter.IAxPresenter;


public interface IAxContentView<T extends IAxPresenter> extends IAxView<T> ,IAxInvalidChecker {
    Context getContext();
}
