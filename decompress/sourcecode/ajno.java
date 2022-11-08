import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajno extends agzi implements ahax
{
    public static final ajno a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajno.class, (agzi)(a = new ajno()));
    }
    
    private ajno() {
        this.b = 0;
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
                if ((d = ajno.d) == null) {
                    synchronized (ajno.class) {
                        if (ajno.d == null) {
                            ajno.d = (ahbe)new agzb((agzi)ajno.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajno.a;
            }
            case 4: {
                return new agza((agzi)ajno.a);
            }
            case 3: {
                return new ajno();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajno.a, "\u0001\u0002\u0001\u0000\ueaaa\u1fae\ue952\u24a1\u0002\u0000\u0000\u0002\ueaaa\u1fae\u143c\u0000\ue952\u24a1\u143c\u0000", new Object[] { "c", "b", ameo.class, aogu.class });
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
