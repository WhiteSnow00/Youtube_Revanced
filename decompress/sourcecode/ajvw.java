import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvw extends agzi implements ahax
{
    public static final ajvw a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public akqb d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajvw.class, a = new ajvw());
    }
    
    private ajvw() {
        this.g = 2;
        this.e = "";
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
                if ((f = ajvw.f) == null) {
                    synchronized (ajvw.class) {
                        if (ajvw.f == null) {
                            ajvw.f = (ahbe)new agzb((agzi)ajvw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajvw.a;
            }
            case 4: {
                return new agza((agzi)ajvw.a);
            }
            case 3: {
                return new ajvw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
