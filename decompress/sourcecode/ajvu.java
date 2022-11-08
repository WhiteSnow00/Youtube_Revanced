import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvu extends agzi implements ahax
{
    public static final ajvu a;
    private static volatile ahbe f;
    public int b;
    public akqb c;
    public String d;
    public aioe e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajvu.class, a = new ajvu());
    }
    
    private ajvu() {
        this.g = 2;
        this.d = "";
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
                if ((f = ajvu.f) == null) {
                    synchronized (ajvu.class) {
                        if (ajvu.f == null) {
                            ajvu.f = (ahbe)new agzb((agzi)ajvu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajvu.a;
            }
            case 4: {
                return new agza((agzi)ajvu.a);
            }
            case 3: {
                return new ajvu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
