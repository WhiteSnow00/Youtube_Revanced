import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksi extends ahcz implements aheo
{
    public static final aksi a;
    private static volatile ahev f;
    public aknj b;
    public aisc c;
    public ahbt d;
    public ahdp e;
    private int g;
    private ahjl h;
    private ajxn i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aksi.class, a = new aksi());
    }
    
    private aksi() {
        this.j = 2;
        this.d = ahbt.b;
        this.e = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aksi.f) == null) {
                    synchronized (aksi.class) {
                        if (aksi.f == null) {
                            aksi.f = (ahev)new ahcs((ahcz)aksi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aksi.a;
            }
            case 4: {
                return new ahcr((ahcz)aksi.a);
            }
            case 3: {
                return new aksi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksi.a, "\u0001\u0006\u0000\u0001\u0001\u0309\u0006\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u041b\u0309\u1409\u0005", new Object[] { "g", "b", "c", "h", "d", "e", aowb.class, "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
