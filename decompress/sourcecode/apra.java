import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apra extends agzi implements ahax
{
    public static final apra a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)apra.class, (agzi)(a = new apra()));
    }
    
    private apra() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apra.d) == null) {
                    synchronized (apra.class) {
                        if (apra.d == null) {
                            apra.d = (ahbe)new agzb((agzi)apra.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apra.a;
            }
            case 4: {
                return new agza((agzi)apra.a);
            }
            case 3: {
                return new apra();
            }
            case 2: {
                return newMessageInfo((MessageLite)apra.a, "\u0001\u0007\u0001\u0000\u0001\u0012\u0007\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\u000e\u103c\u0000\u0012\u103c\u0000", new Object[] { "c", "b", aprh.class, apqz.class, aprj.class, aprf.class, aprn.class, apri.class, apqy.class });
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
