import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiaw extends agzi implements ahax
{
    private static final aiaw a;
    private static volatile ahbe b;
    private int c;
    private String d;
    private int e;
    private String f;
    private boolean g;
    
    static {
        agzi.registerDefaultInstance((Class)aiaw.class, (agzi)(a = new aiaw()));
    }
    
    private aiaw() {
        this.d = "";
        this.f = "";
    }
    
    public static aiav a() {
        return (aiav)aiaw.a.createBuilder();
    }
    
    private void g(final boolean g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void h(final String f) {
        f.getClass();
        this.c |= 0x4;
        this.f = f;
    }
    
    private void i(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    private void j(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aiaw.b) == null) {
                    synchronized (aiaw.class) {
                        if (aiaw.b == null) {
                            aiaw.b = (ahbe)new agzb((agzi)aiaw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiaw.a;
            }
            case 4: {
                return new aiav();
            }
            case 3: {
                return new aiaw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiaw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u1007\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
