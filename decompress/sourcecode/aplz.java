import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplz extends agzi implements ahax
{
    public static final aplz a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aplz.class, a = new aplz());
    }
    
    private aplz() {
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
                if ((d = aplz.d) == null) {
                    synchronized (aplz.class) {
                        if (aplz.d == null) {
                            aplz.d = (ahbe)new agzb((agzi)aplz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aplz.a;
            }
            case 4: {
                return new agza((agzi)aplz.a);
            }
            case 3: {
                return new aplz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplz.a, "\u0001\u0002\u0001\u0000\ueb11\u1f11\ue5d8\u2622\u0002\u0000\u0000\u0002\ueb11\u1f11\u143c\u0000\ue5d8\u2622\u143c\u0000", new Object[] { "c", "b", aibb.class, aibk.class });
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
