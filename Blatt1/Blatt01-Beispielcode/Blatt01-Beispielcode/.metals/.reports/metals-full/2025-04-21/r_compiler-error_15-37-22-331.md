file:///C:/Users/Admin/Documents/deutsche%20aufgaben/uni%20mainz/3.%20Sem/EiS/Blatt1/Blatt01-Beispielcode/Blatt01-Beispielcode/CountDown.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file:///C:/Users/Admin/Documents/deutsche%20aufgaben/uni%20mainz/3.%20Sem/EiS/Blatt1/Blatt01-Beispielcode/Blatt01-Beispielcode/CountDown.java
text:
```scala
public class CountDown {   // Klassenname (Modul) entspricht Dateiname
    public static void main(String[] args) {  // Standard Hauptprogram
        int i=10;                                  // declare variable
        while (i>0) {                   // while loop (for simplicity)
            System.out.println(i);                     // print number
            if (i == 8) {
                System.out.println("ignition sequence start");
            }
            i = i - 1;          // core code almost identical to C/C++
        }
        System.out.println("liftoff!");
    }
}
```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:935)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:164)
	dotty.tools.pc.MetalsDriver.run(MetalsDriver.scala:47)
	dotty.tools.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:31)
	dotty.tools.pc.SimpleCollector.<init>(PcCollector.scala:351)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:116)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator