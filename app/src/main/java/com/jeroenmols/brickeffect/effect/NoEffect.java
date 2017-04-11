/*
 *  Copyright 2016 Jeroen Mols
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.jeroenmols.brickeffect.effect;

import android.graphics.Bitmap;

/**
 * @author Jeroen Mols on 17/04/16.
 */
public class NoEffect implements Effect {
    private Bitmap bitmap;

    @Override
    public void initialize(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public boolean hasNextFrame() {
        return false;
    }

    @Override
    public int getFrameDuration() {
        return 100000000;
    }

    @Override
    public Bitmap nextFrame() {
        return bitmap;
    }
}