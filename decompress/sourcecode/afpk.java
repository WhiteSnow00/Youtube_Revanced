import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpk extends agzi implements ahax
{
    public static final afpk a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public Object d;
    public afph e;
    public agzy f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(afpk.class, a = new afpk());
    }
    
    private afpk() {
        this.c = 0;
        this.h = 2;
        this.f = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy f = this.f;
        if (!f.c()) {
            this.f = agzi.mutableCopy(f);
        }
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
                final ahbe g;
                if ((g = afpk.g) == null) {
                    synchronized (afpk.class) {
                        if (afpk.g == null) {
                            afpk.g = (ahbe)new agzb((agzi)afpk.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return afpk.a;
            }
            case 4: {
                return new agza((agzi)afpk.a);
            }
            case 3: {
                return new afpk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpk.a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u1509\u0000\u0002\u041b\u0004\u143c\u0000", new Object[] { "d", "c", "b", "e", "f", afph.class, afpi.class });
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
