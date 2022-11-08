import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwz extends agzi implements ahax
{
    public static final ajwz a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajwz.class, a = new ajwz());
    }
    
    private ajwz() {
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
                if ((d = ajwz.d) == null) {
                    synchronized (ajwz.class) {
                        if (ajwz.d == null) {
                            ajwz.d = (ahbe)new agzb((agzi)ajwz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajwz.a;
            }
            case 4: {
                return new agza((agzi)ajwz.a);
            }
            case 3: {
                return new ajwz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwz.a, "\u0001\u0002\u0001\u0000\ue2d9\u1a6d\ueb11\u1f11\u0002\u0000\u0000\u0002\ue2d9\u1a6d\u143c\u0000\ueb11\u1f11\u143c\u0000", new Object[] { "c", "b", aokb.class, aibb.class });
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
