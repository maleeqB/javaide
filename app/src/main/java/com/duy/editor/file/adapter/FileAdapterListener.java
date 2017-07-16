/*
 *  Copyright (c) 2017 Tran Le Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.editor.file.adapter;

import android.view.View;

/**
 * Created by Duy on 30-Mar-17.
 */

public interface FileAdapterListener {
    int ACTION_REMOVE = 0;
    int ACTION_CLICK = 1;
    int ACTION_LONG_CLICK = 2;

    void onItemClick(View v, String nameOfFle, int action);

    void onRemoveClick(View view, String nameOfFile, int action);
}