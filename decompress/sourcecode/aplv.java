import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplv extends agzi implements ahax
{
    public static final aplv a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aplv.class, a = new aplv());
    }
    
    private aplv() {
        this.b = 0;
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
                if ((d = aplv.d) == null) {
                    synchronized (aplv.class) {
                        if (aplv.d == null) {
                            aplv.d = (ahbe)new agzb((agzi)aplv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aplv.a;
            }
            case 4: {
                return new agza((agzi)aplv.a);
            }
            case 3: {
                return new aplv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplv.a, "\u0001\u0001\u0001\u0000\ufb9c\u2dd7\ufb9c\u2dd7\u0001\u0000\u0000\u0001\ufb9c\u2dd7\u143c\u0000", new Object[] { "c", "b", amph.class });
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
