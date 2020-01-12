yme --- a poor re-invetion of Git to study Kotlin lang
======

テストの題材(fixture)として `~/yme/src/test/fixture/repo` ディレクトリを作りGitレポジトリにした。[Gitの作り方](https://tech.mercari.com/entry/2015/09/14/175300)を参考にした。

```
``# レポジトリ作成
$ cd ~/yme/src/test
$ mkdir fixture
$ cd fixture
$ git init repo
$ cd repo

# hello worldをadd

$ echo "hello world" > helloworld.txt
$ git add helloworld.txt

# 『坊っちゃん』を青空文庫からダウンロードしてadd

$ curl http://www.aozora.gr.jp/cards/000148/files/752_ruby_2438.zip --output 752_ruby_2438.zip
$ unzip 752_ruby_2438.zip
$ rm 752_ruby_2438.zip
$ git add bocchan.txt

# コミット

$ git commit -m "initial commit"
[master (root-commit) 2b8c1c1] initial commit
 2 files changed, 539 insertions(+)
 create mode 100644 bocchan.txt
 create mode 100644 helloworld.txt
```
