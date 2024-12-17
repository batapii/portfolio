# Portfolio Website

## 概要
私のポートフォリオサイトのソースコードです。
Next.jsとSpring Bootを組み合わせた現代的なWebアプリケーションとして構築しています。

## 機能
- 制作物の紹介
- スキルセット
- 経歴
- お問い合わせフォーム

## 技術スタック
### フロントエンド
- Next.js 14 (App Router)
- TypeScript 5
- TailwindCSS
- ESLint
- Prettier

### バックエンド
- Spring Boot 3
- Kotlin 1.9
- Gradle 8.5
- Spring Security
- Spring Data JPA

### データベース & インフラ
- Supabase
  - PostgreSQL
  - Authentication
  - Storage
  - Edge Functions

### 開発環境
- OrbStack
  - コンテナ管理
  - 開発環境の統一
- Tailscale
  - セキュアな通信
  - VPNネットワーク

## プロジェクト構造

```
.
├── frontend/         # Next.jsフロントエンド
│   ├── src/          
│   │   ├── app/      # ページコンポーネント
│   │   ├── components/ # 共通コンポーネント
│   │   └── lib/      # ユーティリティ
│   └── public/       # 画像等の静的ファイル
├── backend/         # Spring Bootバックエンド
│   └── src/
│       └── main/
│           ├── kotlin/  # APIエンドポイント
│           └── resources/ # 設定ファイル
└── supabase/       # データベース設定
```

## 開発環境のセットアップ
1. 必要なツールのインストール
   ```bash
   brew install --cask orbstack
   npm install
   ```

2. 環境変数の設定
   ```bash
   cp .env.example .env.local
   ```

3. 開発サーバーの起動
   ```bash
   npm run dev
   ```

## 作者
Taishi
