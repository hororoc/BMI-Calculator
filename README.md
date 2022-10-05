# BMI-Calculator
BMI Calculator Android Application

## BMI 계산

- 공식: weight/height^2
- result ≤ 18.5: 저체중
- 18.5 < result ≤ 23 : 정상 체중
- 23 < result ≤ 25 : 과체중
- 25 < result ≤ 30 : 경도 비만
- 30 < result ≤ 35 : 중정도 비만
- result > 35 : 고도 비만

---

- LinearLayout
    - orientation: 방향 지정
- View 연결
→ `findViewById`

```kotlin
val heightEditText: EditText = findViewById(R.id.et_height) // 1)
val weightEditText = findViewById<EditText>(R.id.et_weight) // 2)
```

- Click Listener
→ `setOnClickListener`

```kotlin
confirmButton.setOnClickListener {
		...
}
```

- Log 찍기
→ `Log.d`

```kotlin
Log.d(*tag*, *msg*) // .d: DEBUG
```

- Intent 선언
→ `Intent(*packageContext, cls*)`

```kotlin
val Intent = Intent(this, ResultActivity::class.java)
```

- Intent 시작
→ `startActivity`

```kotlin
startActivity(intent)
```

- Intent에 값 실어 보내기
→ `putExtra(*name*, *value*)`

```kotlin
intent.putExtra("height", height)
```

- Intent에 실려온 값 받기
→ `get*Int*Extra(*name*, *defaultValue*)`

```kotlin
intent.getIntExtra("height", 0)
```
