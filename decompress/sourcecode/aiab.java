import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiab extends agzi implements ahax
{
    public static final aiab a;
    private static volatile ahbe d;
    public int b;
    public aiac c;
    private aiaa e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aiab.class, a = new aiab());
    }
    
    private aiab() {
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
                final ahbe d;
                if ((d = aiab.d) == null) {
                    synchronized (aiab.class) {
                        if (aiab.d == null) {
                            aiab.d = (ahbe)new agzb((agzi)aiab.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiab.a;
            }
            case 4: {
                return new agza((agzi)aiab.a);
            }
            case 3: {
                return new aiab();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiab.a, "\u0001\u0002\u0000\u0001\uf2a1\u264b\uf6f4\u2f9e\u0002\u0000\u0000\u0002\uf2a1\u264b\u1409\u0000\uf6f4\u2f9e\u1409\u0001", new Object[] { "b", "e", "c" });
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
