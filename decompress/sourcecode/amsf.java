import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsf extends agzd implements agze
{
    public static final agzr a;
    public static final amsf b;
    private static volatile ahbe g;
    public int c;
    public int d;
    public agzq e;
    public agzq f;
    private byte h;
    
    static {
        a = (agzr)new altr(3);
        agzi.registerDefaultInstance((Class)amsf.class, (agzi)(b = new amsf()));
    }
    
    private amsf() {
        this.h = 2;
        this.e = emptyIntList();
        this.f = emptyIntList();
    }
    
    public final void a() {
        final agzq e = this.e;
        if (!e.c()) {
            this.e = agzi.mutableCopy(e);
        }
    }
    
    public final void d() {
        final agzq f = this.f;
        if (!f.c()) {
            this.f = agzi.mutableCopy(f);
        }
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
                final ahbe g;
                if ((g = amsf.g) == null) {
                    synchronized (amsf.class) {
                        if (amsf.g == null) {
                            amsf.g = (ahbe)new agzb((agzi)amsf.b);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amsf.b;
            }
            case 4: {
                return new agzc(amsf.b);
            }
            case 3: {
                return new amsf();
            }
            case 2: {
                return newMessageInfo((MessageLite)amsf.b, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001e\u0003\u0016", new Object[] { "c", "d", "e", amse.a(), "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
