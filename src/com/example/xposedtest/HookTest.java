package com.example.xposedtest;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class HookTest implements IXposedHookLoadPackage {

	@Override
	public void handleLoadPackage(LoadPackageParam lpparam) throws Throwable {
//			XposedHelpers.findAndHookMethod(clazz, methodName, parameterTypesAndCallback);
			XposedBridge.log("º”‘ÿ¡À:"+lpparam.packageName);
	}

}
