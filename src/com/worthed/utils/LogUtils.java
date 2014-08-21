/**
 * Copyright 2014 Zhenguo Jin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.worthed.utils;


import android.util.Log;

/**
 * 应用Log工具类
 * 
 * @author jingle1267@163.com
 *
 */
public class LogUtils {

	public static  boolean debug = true;

	public static boolean isDebug() {
		return debug;
	}

	public static void Log(String data) {
		if (debug) {
			Log.d("调试",data);
		}
	}

}