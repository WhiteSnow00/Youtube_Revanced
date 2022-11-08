import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amus extends agzi implements ahax
{
    public static final amus a;
    private static volatile ahbe j;
    public int b;
    public int c;
    public Object d;
    public String e;
    public int f;
    public boolean g;
    public boolean h;
    public alts i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(amus.class, a = new amus());
    }
    
    private amus() {
        this.c = 0;
        this.k = 2;
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
                final ahbe j;
                if ((j = amus.j) == null) {
                    synchronized (amus.class) {
                        if (amus.j == null) {
                            amus.j = (ahbe)new agzb((agzi)amus.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amus.a;
            }
            case 4: {
                return new agza((agzi)amus.a);
            }
            case 3: {
                return new amus();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amus.a, "\u0001\t\u0001\u0001\u0001\u03e7\t\u0000\u0000\u0003\u0001\u1008\u0000\u0003\u103d\u0000\u0004\u103b\u0000\u0005\u143c\u0000\u0006\u100c\u0001\u0007\u143c\u0000\b\u1007\u0006\t\u1007\u0007\u03e7\u1409\b", new Object[] { "d", "c", "b", "e", CommandOuterClass$Command.class, "f", amut.a(), amur.class, "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
