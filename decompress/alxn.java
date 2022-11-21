import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxn extends ahcz implements aheo
{
    public static final alxn a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public int d;
    public ahbt e;
    public boolean f;
    public boolean g;
    public float h;
    public int i;
    private ahjl k;
    private byte l;
    
    static {
        final alxn a2 = new alxn();
        ahcz.registerDefaultInstance(alxn.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 314600826, ahgc.k, alxn.class);
    }
    
    private alxn() {
        this.l = 2;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = alxn.j) == null) {
                    synchronized (alxn.class) {
                        if (alxn.j == null) {
                            alxn.j = (ahev)new ahcs((ahcz)alxn.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return alxn.a;
            }
            case 4: {
                return new ahcr((ahcz)alxn.a);
            }
            case 3: {
                return new alxn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxn.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1001\u0005\u0007\u100b\u0006", new Object[] { "c", "d", ajgj.u, "e", "k", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
