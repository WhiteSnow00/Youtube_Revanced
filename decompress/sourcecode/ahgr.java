import com.google.protobuf.MessageLite;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgr extends agzi implements ahax
{
    private static final agzr a;
    private static final ahgr b;
    private static volatile ahbe c;
    private agzq d;
    
    static {
        a = (agzr)new prz(8);
        agzi.registerDefaultInstance(ahgr.class, b = new ahgr());
    }
    
    private ahgr() {
        this.d = agzi.emptyIntList();
    }
    
    public static ahgq a() {
        return (ahgq)ahgr.b.createBuilder();
    }
    
    private void d(final Iterable iterable) {
        this.e();
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.d.g(((ahgp)iterator.next()).h);
        }
    }
    
    private void e() {
        final agzq d = this.d;
        if (!d.c()) {
            this.d = agzi.mutableCopy(d);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahgr.c) == null) {
                    synchronized (ahgr.class) {
                        if (ahgr.c == null) {
                            ahgr.c = (ahbe)new agzb((agzi)ahgr.b);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahgr.b;
            }
            case 4: {
                return new ahgq();
            }
            case 3: {
                return new ahgr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgr.b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "d", ahgp.a() });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
