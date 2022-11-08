import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdh extends agzi implements ahax
{
    public static final ajdh a;
    private static volatile ahbe j;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public ajdg f;
    public anss g;
    public anss h;
    public agyc i;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(ajdh.class, a = new ajdh());
    }
    
    private ajdh() {
        this.l = 2;
        this.i = agyc.b;
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
                final ahbe j;
                if ((j = ajdh.j) == null) {
                    synchronized (ajdh.class) {
                        if (ajdh.j == null) {
                            ajdh.j = (ahbe)new agzb((agzi)ajdh.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajdh.a;
            }
            case 4: {
                return new agza((agzi)ajdh.a);
            }
            case 3: {
                return new ajdh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdh.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0007\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0004\u0004\u1409\u0006\u0005\u100a\u0007\b\u1409\u0003\t\u1409\u0005\n\u1409\u0000", new Object[] { "b", "d", "e", "g", "k", "i", "f", "h", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
