# PinView
PIN 码专用输入控件，支持任意长度和输入任意数据

#### 号外：听说「nanchen」搞了一个 Android 开发者的免费福利，不行你看：[给 Android 开发者的一点福利：免费模拟面试](http://mp.weixin.qq.com/s/WRdSmGxwDp-CpQcSlmJYlg)

- 该项目主要参考了 [https://github.com/GoodieBag/Pinview](https://github.com/GoodieBag/Pinview) 的部分代码。


## 效果图<br>
![](https://github.com/nanchen2251/PinView/blob/master/GIF.gif)

#### ⊙开源不易，希望给个star或者fork奖励
#### ⊙拥抱开源：https://github.com/nanchen2251/
#### ⊙交流群（拒绝无脑问）：118116509 <a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=e6ad4af66393684e1d0c9441403b049d2d5670ec0ce9f72150e694cbb7c16b0a"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="Android神技侧漏交流群" title="Android神技侧漏交流群"></a>( 点击图标即可加入 )<br>

## 特点
- 支持更改 PinView 中每一个 EditText 的输入前、输入后、正在输入的 background
- 支持设置任意长度的 PIN 码长度
- 支持设置可输入的 PIN 码格式，目前支持文本、数字、可以自己自主设置
- 支持设置输入错误次数限制时间
- 支持设置输入的 PIN 码是否以明文显示
- 支持输入默认值和清除数据
- 支持设置可输入长度和每一个 EditText 的宽高和背景

  
## 使用方法
#### 1、添加依赖<br>
##### Step 1. Add it in your root build.gradle at the end of repositories:
```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
##### Step 2. Add the dependency
```java
dependencies {
	        compile 'com.github.nanchen2251:PinView:1.0.1'

	}
```
#### 2、使用方式最好参照 demo <br>
```java
    mPinView.setCanInput(true);// 设置是否可输入 默认true
    mPinView.setHint("");      // 设置EditText的Hint
    mPinView.setInputType(PinView.InputType.NUMBER); // 设置输入的格式
    mPinView.setPassword(true); // 设置是否以明文显示
    mPinView.setPinHeight(60);  // 设置每一个EditText的高度
    mPinView.setPinWidth(60);   // 设置每一个EditText的宽度
    mPinView.setPinLength(4);   // 设置可输入的 PIN 码长度，默认4
    mPinView.clearValue();      // 清除输入的数据
    mPinView.setValue("1234");  // 设置输入值
    mPinView.setPinViewEventListener(this); // 设置输入完毕的监听事件
```
#### 3、在 Xml 中使用 <br>
```java
<com.nanchen.pinview.PinView
     android:id="@+id/pinView"
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:layout_gravity="center_vertical"
     android:layout_marginLeft="20dp"
     app:cursorVisible="false"
     app:forceKeyboard="false"
     app:hint=""
     app:inputType="number"
     app:password="true"
     app:pinBackground="@drawable/example_drawable_with_grey_disabled"
     app:pinHeight="30dp"
     app:pinLength="4"
     app:pinWidth="30dp"
     app:splitWidth="20dp"/>
```
### 关于作者
    南尘<br>
    四川成都<br>
    [其它开源](https://github.com/nanchen2251/)<br>
    [个人博客](https://nanchen2251.github.io/)<br>
    [简书](http://www.jianshu.com/u/f690947ed5a6)<br>
    [博客园](http://www.cnblogs.com/liushilin/)<br>
    交流群：118116509<br>
    欢迎投稿(关注)我的唯一公众号，公众号搜索 nanchen 或者扫描下方二维码：<br>
    ![](http://images2015.cnblogs.com/blog/845964/201707/845964-20170718083641599-1963842541.jpg)


> 1024 - 梦想，永不止步!  
爱编程 不爱Bug  
爱加班 不爱黑眼圈  
固执 但不偏执  
疯狂 但不疯癫  
生活里的菜鸟  
工作中的大神  
身怀宝藏，一心憧憬星辰大海  
追求极致，目标始于高山之巅  
一群怀揣好奇，梦想改变世界的孩子  
一群追日逐浪，正在改变世界的极客  
你们用最美的语言，诠释着科技的力量  
你们用极速的创新，引领着时代的变迁  
  
------至所有正在努力奋斗的程序猿们！加油！！  
    
## Licenses
```
 Copyright 2018 nanchen(刘世麟)

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
```
