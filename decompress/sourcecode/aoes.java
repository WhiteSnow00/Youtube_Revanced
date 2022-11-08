import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoes extends agzi implements ahax
{
    public static final aoes a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public String d;
    public aioe e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aoes.class, a = new aoes());
    }
    
    private aoes() {
        this.g = 2;
        this.c = "";
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
                if ((f = aoes.f) == null) {
                    synchronized (aoes.class) {
                        if (aoes.f == null) {
                            aoes.f = (ahbe)new agzb((agzi)aoes.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoes.a;
            }
            case 4: {
                return new agza((agzi)aoes.a);
            }
            case 3: {
                return new aoes();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoes.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
