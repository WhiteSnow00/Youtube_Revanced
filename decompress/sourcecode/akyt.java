import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyt extends agzi implements ahax
{
    public static final akyt a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance((Class)akyt.class, (agzi)(a = new akyt()));
    }
    
    private akyt() {
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
                if ((d = akyt.d) == null) {
                    synchronized (akyt.class) {
                        if (akyt.d == null) {
                            akyt.d = (ahbe)new agzb((agzi)akyt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyt.a;
            }
            case 4: {
                return new agza((agzi)akyt.a);
            }
            case 3: {
                return new akyt();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyt.a, "\u0001\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u103c\u0000\f\u103c\u0000\r\u103c\u0000", new Object[] { "c", "b", akyl.class, akyh.class, akym.class, akyq.class, akyp.class, akyk.class, akyi.class, akyo.class, akys.class, akyn.class, akyr.class, akyg.class, akyj.class });
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
