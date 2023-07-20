class User < ApplicationRecord
  # Include default devise modules. Others available are:
  # :confirmable, :lockable, :timeoutable, :trackable and :omniauthable
  
  # 以下はdeviseによるモデルの作成で自動で追加される機能名の記述
  devise :database_authenticatable, # パスワードの正確性を検証
         :registerable,             # ユーザ登録や編集、削除
         :recoverable,              # パスワードをリセット
         :rememberable,             # ログイン情報を保存
         :validatable               # email のフォーマットなどのバリデーション
end
