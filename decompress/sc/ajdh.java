import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdh extends ahbh implements ahcw
{
    public static final ajdh a;
    private static volatile ahdd p;
    public int b;
    public int c;
    public int d;
    public ajdg e;
    public ajdi f;
    public ajdl g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public float m;
    public boolean n;
    public float o;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdh.class, (ahbh)(a = new ajdh()));
    }
    
    private ajdh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd p3;
                if ((p3 = ajdh.p) == null) {
                    synchronized (ajdh.class) {
                        if (ajdh.p == null) {
                            ajdh.p = (ahdd)new ahba((ahbh)ajdh.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ajdh.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdh.a);
            }
            case 3: {
                return new ajdh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdh.a, "\u0001\r\u0000\u0001\u0001\u001b\r\u0000\u0000\u0000\u0001\u1004\u0000\u0003\u1009\u0007\u0005\u1004\u0001\b\u1009\u0004\n\u1009\t\u000b\u1004\n\r\u1004\r\u000e\u1007\u000e\u0015\u1007\u0013\u0016\u1001\u0014\u0019\u1007\u0017\u001a\u1004\f\u001b\u1001\u0018", new Object[] { "b", "c", "f", "d", "e", "g", "h", "j", "k", "l", "m", "n", "i", "o" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
