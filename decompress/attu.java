import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class attu
{
    public static final String a(final Object o) {
        o.getClass();
        return o.getClass().getSimpleName();
    }
    
    public static final String b(final Object o) {
        o.getClass();
        return Integer.toHexString(System.identityHashCode(o));
    }
    
    public static final String c(final atov atov) {
        String string;
        if (atov instanceof atyj) {
            string = atov.toString();
        }
        else {
            Object o = null;
            try {
                final String b = b(atov);
                final StringBuilder sb = new StringBuilder();
                sb.append(atov);
                sb.append("@");
                sb.append(b);
                sb.toString();
            }
            finally {
                final Throwable t;
                o = areq.H(t);
            }
            if (atnj.a(o) != null) {
                final String name = atov.getClass().getName();
                final String b2 = b(atov);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append("@");
                sb2.append(b2);
                o = sb2.toString();
            }
            string = (String)o;
        }
        return string;
    }
    
    public static final attr d(final atpa atpa) {
        atpa.getClass();
        atpa plus = atpa;
        if (atpa.get(atut.c) == null) {
            plus = atpa.plus((atpa)aqvs.r());
        }
        return new atyh(plus);
    }
    
    static boolean e(final asmg asmg) {
        try {
            return ((asqf)asmg).j;
        }
        finally {
            final Throwable t;
            asjv.a(t);
            return true;
        }
    }
    
    public static boolean f(long value, final auna auna, final Queue queue, final AtomicLong atomicLong, final asmg asmg) {
        long n = value & Long.MIN_VALUE;
        while (true) {
            if (n != value) {
                if (e(asmg)) {
                    return true;
                }
                final Object poll = queue.poll();
                if (poll == null) {
                    auna.tw();
                    return true;
                }
                auna.tt(poll);
                ++n;
            }
            else {
                if (e(asmg)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    auna.tw();
                    return true;
                }
                if ((value = atomicLong.get()) != n) {
                    continue;
                }
                final long addAndGet = atomicLong.addAndGet(-(n & Long.MAX_VALUE));
                if ((Long.MAX_VALUE & addAndGet) == 0x0L) {
                    return false;
                }
                value = addAndGet;
                n = (addAndGet & Long.MIN_VALUE);
            }
        }
    }
    
    public static boolean g(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
