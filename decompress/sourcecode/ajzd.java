import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajzd extends agzi implements ahax
{
    public static final ajzd a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajzd.class, a = new ajzd());
    }
    
    private ajzd() {
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
                if ((d = ajzd.d) == null) {
                    synchronized (ajzd.class) {
                        if (ajzd.d == null) {
                            ajzd.d = (ahbe)new agzb((agzi)ajzd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajzd.a;
            }
            case 4: {
                return new agza((agzi)ajzd.a);
            }
            case 3: {
                return new ajzd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajzd.a, "\u0001\u0001\u0001\u0000\ue46c\u1687\ue46c\u1687\u0001\u0000\u0000\u0001\ue46c\u1687\u143c\u0000", new Object[] { "c", "b", ajzf.class });
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