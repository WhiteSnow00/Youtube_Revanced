import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfj extends agzi implements ahax
{
    public static final amfj a;
    private static volatile ahbe d;
    public int b;
    public amfi c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amfj.class, (agzi)(a = new amfj()));
    }
    
    private amfj() {
        this.e = 2;
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
                final ahbe d;
                if ((d = amfj.d) == null) {
                    synchronized (amfj.class) {
                        if (amfj.d == null) {
                            amfj.d = (ahbe)new agzb((agzi)amfj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amfj.a;
            }
            case 4: {
                return new agza((agzi)amfj.a);
            }
            case 3: {
                return new amfj();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfj.a, "\u0001\u0001\u0000\u0001\uecac\u3ac7\uecac\u3ac7\u0001\u0000\u0000\u0001\uecac\u3ac7\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
