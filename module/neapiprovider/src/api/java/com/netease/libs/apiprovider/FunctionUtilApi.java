package com.netease.libs.apiprovider;

import java.util.Timer;

/**
 * com.netease.demo.apiprovider.FunctionUtil 的 api 接口
 */
public interface FunctionUtilApi {
  long getSDAvailableSize();

  void doNoReturn();

  int add(int a, int b);

  Timer getTimer();
}
