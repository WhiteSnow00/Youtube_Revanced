import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmy extends agzi implements ahax
{
    public static final ajmy a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajmy.class, (agzi)(a = new ajmy()));
    }
    
    private ajmy() {
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
                if ((d = ajmy.d) == null) {
                    synchronized (ajmy.class) {
                        if (ajmy.d == null) {
                            ajmy.d = (ahbe)new agzb((agzi)ajmy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajmy.a;
            }
            case 4: {
                return new agza((agzi)ajmy.a);
            }
            case 3: {
                return new ajmy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmy.a, "\u0001\u0001\u0001\u0000\uee32\u327a\uee32\u327a\u0001\u0000\u0000\u0001\uee32\u327a\u143c\u0000", new Object[] { "c", "b", ajmx.class });
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
