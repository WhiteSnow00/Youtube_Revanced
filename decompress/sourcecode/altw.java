import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class altw extends agzd implements agze
{
    public static final altw a;
    public static final agzg b;
    private static volatile ahbe g;
    public agyc c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;
    private byte i;
    
    static {
        final altw a2 = new altw();
        agzi.registerDefaultInstance((Class)altw.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqek.a, (Object)a2, (MessageLite)a2, (agzn)null, 169494678, ahcm.k, (Class)altw.class);
    }
    
    private altw() {
        this.i = 2;
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = altw.g) == null) {
                    synchronized (altw.class) {
                        if (altw.g == null) {
                            altw.g = (ahbe)new agzb((agzi)altw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return altw.a;
            }
            case 4: {
                return new agzc(altw.a);
            }
            case 3: {
                return new altw();
            }
            case 2: {
                return newMessageInfo((MessageLite)altw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "h", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
