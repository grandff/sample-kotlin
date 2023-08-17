# 첫번쨰 앱 만들기 메모

## 만드는 순서

1. Empty Compose Activity 선택
2. 최소 sdk는 API 21로 설정

## 안드로이스 스튜디오 구성

![안드로이드스튜디오](<images/스크린샷 2023-08-17 오전 10.05.21.png>)

## MainActivity 구성

- onCreate()가 앱의 진입점임
- onCreate() 내의 setContent() 함수는 구성 가능한 함수를 통해 레이아웃을 정의함
- @Composable 주석으로 표시된 함수는 다른 곳에서 호출이 가능함(반환하지않음)

```kotlin
@Preview(showBackground = true) // 앱 미리보기에 배경이 추가됨. preview를 통해 미리보기가 가능함
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}
```

## 배경 색상 변경

배경 색상을 변경하기 위해서 텍스트를 Surface로 둘러싸야함.

Suface는 배경 색상이나 테두리와 같은 모양을 개발자가 변경할 수 있는 UI 섹션임.

1. 단축키 : Option + Enter
2. Surrond with widget > Surrond with Container 선택
3. Box 대신 Surface() 입력
4. color 매개변수 추가 (Color.Megenta)
5. import를 알파벳 순으로 정리하기 위해서 Help > Optimize Imports 선택

## 패딩 추가

Modifier는 컴포저블을 강화하거나 장식하는 데 사용함.

Modifier.padding() 함수를 사용해서 실행함.

- Text에 modifier 옵션 추가

```kotlin
@Composable
fun Greeting(name: String) {
    Surface(color = Color.Magenta) {
        Text(text = "Hello my name is $name!", modifier = Modifier.padding(24.dp))
    }
}
```
