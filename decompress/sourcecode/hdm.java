import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdm extends agzi implements ahax
{
    public static final hdm a;
    private static volatile ahbe d;
    public int b;
    public aioe c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(hdm.class, a = new hdm());
    }
    
    private hdm() {
        this.e = 2;
    }
    
    @Override
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
                if ((d = hdm.d) == null) {
                    synchronized (hdm.class) {
                        if (hdm.d == null) {
                            hdm.d = (ahbe)new agzb((agzi)hdm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return hdm.a;
            }
            case 4: {
                return new agza((agzi)hdm.a);
            }
            case 3: {
                return new hdm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)hdm.a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
