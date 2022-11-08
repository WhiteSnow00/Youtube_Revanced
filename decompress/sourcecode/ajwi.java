import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwi extends agzi implements ahax
{
    public static final ajwi a;
    private static volatile ahbe b;
    private int c;
    private apej d;
    private aphv e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ajwi.class, a = new ajwi());
    }
    
    private ajwi() {
        this.f = 2;
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
                final ahbe b2;
                if ((b2 = ajwi.b) == null) {
                    synchronized (ajwi.class) {
                        if (ajwi.b == null) {
                            ajwi.b = (ahbe)new agzb((agzi)ajwi.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajwi.a;
            }
            case 4: {
                return new agza((agzi)ajwi.a);
            }
            case 3: {
                return new ajwi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwi.a, "\u0001\u0002\u0000\u0001\ufe3f\u1e16\ue70c\u3531\u0002\u0000\u0000\u0002\ufe3f\u1e16\u1409\u0001\ue70c\u3531\u1409\u0002", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
