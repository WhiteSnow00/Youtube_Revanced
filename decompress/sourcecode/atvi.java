import java.util.Iterator;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atvi
{
    private static final String a;
    private static final String b;
    
    static {
        Object g = null;
        try {
            Class.forName("atln").getCanonicalName();
        }
        finally {
            final Throwable t;
            g = arxj.g(t);
        }
        Object o = g;
        if (atjr.a(g) != null) {
            o = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String)o;
        Object g2 = null;
        try {
            Class.forName("atvi").getCanonicalName();
        }
        finally {
            final Throwable t2;
            g2 = arxj.g(t2);
        }
        Object o2 = g2;
        if (atjr.a(g2) != null) {
            o2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        b = (String)o2;
    }
    
    public static final Throwable a(final Throwable t, atlq callerFrame) {
        final Throwable cause = t.getCause();
        final int n = 0;
        atjp atjp = null;
        Label_0103: {
            if (cause != null && atnh.c((Object)cause.getClass(), (Object)t.getClass())) {
                final StackTraceElement[] stackTrace = t.getStackTrace();
                for (int length = stackTrace.length, i = 0; i < length; ++i) {
                    if (d(stackTrace[i])) {
                        atjp = aqql.t((Object)cause, (Object)stackTrace);
                        break Label_0103;
                    }
                }
                atjp = aqql.t((Object)t, (Object)new StackTraceElement[0]);
            }
            else {
                atjp = aqql.t((Object)t, (Object)new StackTraceElement[0]);
            }
        }
        final Throwable t2 = (Throwable)atjp.a;
        final StackTraceElement[] array = (StackTraceElement[])atjp.b;
        final Throwable g = g(t2);
        if (g == null) {
            return t;
        }
        final ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<StackTraceElement>();
        final StackTraceElement stackTraceElement = callerFrame.getStackTraceElement();
        atlq atlq = callerFrame;
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
            atlq = callerFrame;
        }
        while (true) {
            callerFrame = atlq;
            if (!(atlq instanceof atlq)) {
                callerFrame = null;
            }
            if (callerFrame == null) {
                break;
            }
            callerFrame = callerFrame.getCallerFrame();
            if (callerFrame == null) {
                break;
            }
            final StackTraceElement stackTraceElement2 = callerFrame.getStackTraceElement();
            atlq = callerFrame;
            if (stackTraceElement2 == null) {
                continue;
            }
            arrayDeque.add(stackTraceElement2);
            atlq = callerFrame;
        }
        if (arrayDeque.isEmpty()) {
            return t;
        }
        Label_0404: {
            if (t2 != t) {
                while (true) {
                    for (int length2 = array.length, j = 0; j < length2; ++j) {
                        if (d(array[j])) {
                            final int n2 = j + 1;
                            int n3 = array.length - 1;
                            if (n2 > n3) {
                                break Label_0404;
                            }
                            while (true) {
                                final StackTraceElement stackTraceElement3 = array[n3];
                                final StackTraceElement stackTraceElement4 = arrayDeque.getLast();
                                if (stackTraceElement3.getLineNumber() == stackTraceElement4.getLineNumber() && atnh.c((Object)stackTraceElement3.getMethodName(), (Object)stackTraceElement4.getMethodName()) && atnh.c((Object)stackTraceElement3.getFileName(), (Object)stackTraceElement4.getFileName()) && atnh.c((Object)stackTraceElement3.getClassName(), (Object)stackTraceElement4.getClassName())) {
                                    arrayDeque.removeLast();
                                }
                                arrayDeque.addFirst(array[n3]);
                                if (n3 == n2) {
                                    break Label_0404;
                                }
                                --n3;
                            }
                        }
                        else {}
                    }
                    int j = -1;
                    continue;
                }
            }
        }
        arrayDeque.addFirst(e());
        final StackTraceElement[] stackTrace2 = t2.getStackTrace();
        final int f = f(stackTrace2, atvi.a);
        if (f == -1) {
            final StackTraceElement[] array2 = arrayDeque.toArray(new StackTraceElement[0]);
            array2.getClass();
            g.setStackTrace(array2);
        }
        else {
            final StackTraceElement[] stackTrace3 = new StackTraceElement[arrayDeque.size() + f];
            for (int k = 0; k < f; ++k) {
                stackTrace3[k] = stackTrace2[k];
            }
            final Iterator<StackTraceElement> iterator = arrayDeque.iterator();
            int n4 = n;
            while (iterator.hasNext()) {
                stackTrace3[n4 + f] = iterator.next();
                ++n4;
            }
            g.setStackTrace(stackTrace3);
        }
        return g;
    }
    
    public static final Throwable b(final Throwable t) {
        if (!atqb.b) {
            return t;
        }
        final Throwable g = g(t);
        if (g == null) {
            return t;
        }
        final StackTraceElement[] stackTrace = g.getStackTrace();
        final int length = stackTrace.length;
        final int f = f(stackTrace, atvi.b);
        final int f2 = f(stackTrace, atvi.a);
        final int n = 0;
        int n2;
        if (f2 == -1) {
            n2 = 0;
        }
        else {
            n2 = length - f2;
        }
        final int n3 = length - f - n2;
        final StackTraceElement[] stackTrace2 = new StackTraceElement[n3];
        for (int i = n; i < n3; ++i) {
            StackTraceElement e;
            if (i == 0) {
                e = e();
            }
            else {
                e = stackTrace[f + 1 + i - 1];
            }
            stackTrace2[i] = e;
        }
        g.setStackTrace(stackTrace2);
        return g;
    }
    
    public static final Throwable c(final Throwable t) {
        t.getClass();
        final Throwable cause = t.getCause();
        if (cause != null) {
            if (atnh.c((Object)cause.getClass(), (Object)t.getClass())) {
                final StackTraceElement[] stackTrace = t.getStackTrace();
                for (int length = stackTrace.length, i = 0; i < length; ++i) {
                    if (d(stackTrace[i])) {
                        return cause;
                    }
                }
            }
        }
        return t;
    }
    
    public static final boolean d(final StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        return aubt.o(stackTraceElement.getClassName(), "\b\b\b");
    }
    
    public static final StackTraceElement e() {
        return new StackTraceElement("\b\b\b(Coroutine boundary", "\b", "\b", -1);
    }
    
    private static final int f(final StackTraceElement[] array, final String s) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (atnh.c((Object)s, (Object)array[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
    
    private static final Throwable g(final Throwable t) {
        final Throwable a = atur.a(t);
        if (a == null) {
            return null;
        }
        if (!(t instanceof atpr) && !atnh.c((Object)a.getMessage(), (Object)t.getMessage())) {
            return null;
        }
        return a;
    }
}
