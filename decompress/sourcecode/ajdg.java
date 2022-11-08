import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdg extends agzi implements ahax
{
    public static final ajdg a;
    private static volatile ahbe f;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajdg.class, a = new ajdg());
    }
    
    private ajdg() {
        this.g = 2;
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
                final ahbe f;
                if ((f = ajdg.f) == null) {
                    synchronized (ajdg.class) {
                        if (ajdg.f == null) {
                            ajdg.f = (ahbe)new agzb((agzi)ajdg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajdg.a;
            }
            case 4: {
                return new agza((agzi)ajdg.a);
            }
            case 3: {
                return new ajdg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
