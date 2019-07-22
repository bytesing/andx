/*
 * Created by <a href="mailto:bytesing.inc@gmail.com">bytesing.inc</a> on 7/23/19 12:20 AM.
 * Copyright (c) 2019 <a href="mailto:bytesing.inc@gmail.com">bytesing.inc.</a> All rights reserved.
 */

package com.bytesing.andx.mvp.ipresenter;

import android.os.Bundle;

import com.bytesing.andx.mvp.check.IAxInvalidChecker;


public interface IAxPresenter extends IAxInvalidChecker {
    void handleArgs(Bundle args);
}
