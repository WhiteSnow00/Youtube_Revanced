import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicg extends agzi implements ahax
{
    private static final aicg a;
    private static volatile ahbe b;
    private int c;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aicg.class, (agzi)(a = new aicg()));
    }
    
    private aicg() {
    }
    
    public static aicf a() {
        return (aicf)aicg.a.createBuilder();
    }
    
    public static aicg c() {
        return aicg.a;
    }
    
    private void f(final aopr aopr) {
        this.d = aopr.g;
        this.c |= 0x1;
    }
    
    public aopr d() {
        aopr aopr;
        if ((aopr = aopr.b(this.d)) == null) {
            aopr = aopr.a;
        }
        return aopr;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aicg.b) == null) {
                    synchronized (aicg.class) {
                        if (aicg.b == null) {
                            aicg.b = (ahbe)new agzb((agzi)aicg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aicg.a;
            }
            case 4: {
                return new aicf();
            }
            case 3: {
                return new aicg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aicg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", aopr.a() });
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
