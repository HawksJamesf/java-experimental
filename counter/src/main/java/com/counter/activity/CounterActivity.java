package com.counter.activity;

import com.counter.app.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends Activity {
	private TextView tvCount, tvResult;

	// private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10,
	// bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20;
	String count = "";
	String resultString;
	String regex1 = "\\d+(\\.\\d+)?";// 用于识别运算符的位置
	// String regex2 = "\\d+[-+x/]";//用于识别0的位置，已弃用
	String regex3 = "\\d+\\.\\d+";// 用于匹配小数
	String regex4 = "\\d+(\\.\\d+)?([-+x/]\\d+)?";// 用于判断能添加小数点的情况
	// String regex5="\\d+\\.?\\d+[x-/+]\\d+\\.?\\d+";
	String tagString;
	int tagInt;
	boolean isNumber = true;

	double resultDouble;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.counter_main);
		tvCount = (TextView) findViewById(R.id.tv_count);
		tvResult = (TextView) findViewById(R.id.tv_result);

	}

	public void doOnClicks(View v) {
		Button button = (Button) v;
		boolean isClickable = button.isClickable();
		switch (v.getId()) {
		case R.id.bt00:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);
				// if (!TextUtils.isEmpty(count)) {
				//
				// if (count.matches(regex2)) {
				// Toast.makeText(CounterActivity.this, "除数不为0请重新输入",
				// Toast.LENGTH_SHORT).show();
				// } else {
				//
				// }
				// } else {
				// Toast.makeText(CounterActivity.this, "请重新输入",
				// Toast.LENGTH_SHORT).show();
				// }

			}
			break;
		case R.id.bt01:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);
			}
			break;
		case R.id.bt02:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);

			}
			break;
		case R.id.bt03:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);

			}
			break;
		case R.id.bt04:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);

			}
			break;
		case R.id.bt05:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);

			}
			break;
		case R.id.bt06:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);

			}
			break;
		case R.id.bt07:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);

			}
			break;
		case R.id.bt08:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);

			}
			break;
		case R.id.bt09:
			if (isClickable) {
				count += button.getText().toString();
				tvCount.setText(count);
			}
			break;
		case R.id.add_bt:
			if (isClickable) {
				if (count.matches(regex1)) {
					count += button.getText().toString().trim();
					tvCount.setText(count);
					tagString = "\\+";// 标记加法
					tagInt = 0;
					isNumber = true;
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();

				}
			}
			break;
		case R.id.sub_bt:
			if (isClickable) {
				if (count.matches(regex1)) {
					count += button.getText().toString();
					tvCount.setText(count);
					tagString = "\\-";// 标记减法
					tagInt = 1;
					isNumber = true;
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();

				}
			}
			break;
		case R.id.mul_bt:
			if (isClickable) {
				if (count.matches(regex1)) {
					count += button.getText().toString();
					tvCount.setText(count);
					tagString = "x";// 标记乘法
					tagInt = 2;
					isNumber = true;
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();

				}
			}
			break;
		case R.id.div_bt:
			if (isClickable) {
				if (count.matches(regex1)) {
					count += button.getText().toString();
					tvCount.setText(count);
					tagString = "\\/";// 标记除法
					tagInt = 3;
					isNumber = true;
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();

				}
			}
			break;
		case R.id.bt14:
			if (isClickable) {
				if (isNumber) {
					count += button.getText().toString();
					tvCount.setText(count);
					isNumber = false;
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();

				}
			}
			break;
		//back能让存在bug，eg:12.12-122.,当使用back到12.12-，再怎么添加也不能让isNumber=true，除非，往后再back一位，才能解决bug
		case R.id.back_bt:
			if (isClickable) {
				if (!TextUtils.isEmpty(count)) {
					count = count.substring(0, count.length() - 1);
					tvCount.setText(count);
					if (count.matches(regex4)) {
						if (count.matches(regex3)) {
							break;
						}
						isNumber = true;
					}
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();

				}
			}
			break;
		case R.id.clear_bt:
			if (isClickable) {
				tvCount.setText("");
				count = "";
				tvResult.setText("");
				resultString = "";
				isNumber = true;
				Toast.makeText(CounterActivity.this, "已经清除", Toast.LENGTH_SHORT)
						.show();

			}
			break;
		case R.id.bt17:
			if (isClickable) {
				if (count.matches(regex1)) {
					count += button.getText().toString();
					tvCount.setText(count);
					tagString = "\\^";// 标记指数
					tagInt = 4;
					isNumber = true;
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();

				}
			}
			break;
		case R.id.bt18:
			if (isClickable) {
				if (count.matches(regex1)) {
					count += button.getText().toString();
					tvCount.setText(count);
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();

				}
			}
			break;
		case R.id.bt19:
			if (isClickable) {
				if (count.matches(regex1)) {
					count += button.getText().toString();
					tvCount.setText(count);
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();

				}
			}
			break;

		case R.id.bt20:
			if (isClickable) {
				String[] array = count.split(tagString);
				if (!TextUtils.isEmpty(count)) {
					if (array != null && array.length == 2) {
						switch (tagInt) {
						case 0:
							resultDouble = Double.parseDouble(array[0])
									+ Double.parseDouble(array[1]);
							resultString = String.valueOf(resultDouble);
							tvResult.setText(resultString);
							break;
						case 1:
							resultDouble = Double.parseDouble(array[0])
									- Double.parseDouble(array[1]);
							resultString = String.valueOf(resultDouble);
							tvResult.setText(resultString);
							break;
						case 2:
							resultDouble = Double.parseDouble(array[0])
									* Double.parseDouble(array[1]);
							resultString = String.valueOf(resultDouble);
							tvResult.setText(resultString);
							break;
						case 3:
							// 判断除数不为0
							if (!array[1].equals("0")) {
								resultDouble = Double.parseDouble(array[0])
										/ Double.parseDouble(array[1]);
								resultString = String.valueOf(resultDouble);
								tvResult.setText(resultString);
							} else {
								Toast.makeText(CounterActivity.this, "除数不为0",
										Toast.LENGTH_SHORT).show();
							}
							break;
						case 4:
							resultDouble = Math.pow(
									Double.parseDouble(array[0]),
									Double.parseDouble(array[1]));
							resultString = String.valueOf(resultDouble);
							tvResult.setText(resultString);
							break;

						default:
							break;
						}
					}
				} else {
					Toast.makeText(CounterActivity.this, "输入有误，重新输入",
							Toast.LENGTH_SHORT).show();
				}
			}
			break;
		default:
			break;
		}
	}
}
