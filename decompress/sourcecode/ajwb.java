import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwb extends agzi implements ahax
{
    public static final ajwb a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public String d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajwb.class, a = new ajwb());
    }
    
    private ajwb() {
        this.g = 2;
        this.d = "";
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
                if ((f = ajwb.f) == null) {
                    synchronized (ajwb.class) {
                        if (ajwb.f == null) {
                            ajwb.f = (ahbe)new agzb((agzi)ajwb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajwb.a;
            }
            case 4: {
                return new agza((agzi)ajwb.a);
            }
            case 3: {
                return new ajwb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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