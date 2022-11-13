import java.util.List;
import java.util.Iterator;
import com.google.protos.youtube.elements.CommandOuterClass$GestureOptions;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqds
{
    private final vfp a;
    private final aqdy b;
    
    public aqds(final aqdy b, final vfp a) {
        this.b = b;
        this.a = a;
    }
    
    public static aeea b(final aqdy aqdy) {
        return new aeea(aqdy.toBuilder());
    }
    
    public final afft a() {
        final affr affr = new affr();
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)this.b.e).iterator();
        while (iterator.hasNext()) {
            afel.h(new aqdt((aqdz)((ahaz)((ahbh)iterator.next()).toBuilder()).build(), this.a));
        }
        final afkf d = afel.g().D();
        while (((Iterator)d).hasNext()) {
            final aqdt aqdt = (aqdt)((Iterator)d).next();
            final affr affr2 = new affr();
            CommandOuterClass$Command commandOuterClass$Command;
            if ((commandOuterClass$Command = aqdt.b.e) == null) {
                commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
            }
            final aeea b = aqep.b(commandOuterClass$Command);
            final vfp a = aqdt.a;
            b.B();
            affr2.j((Iterable)aqep.a());
            CommandOuterClass$Command commandOuterClass$Command2;
            if ((commandOuterClass$Command2 = aqdt.b.f) == null) {
                commandOuterClass$Command2 = CommandOuterClass$Command.getDefaultInstance();
            }
            final aeea b2 = aqep.b(commandOuterClass$Command2);
            final vfp a2 = aqdt.a;
            b2.B();
            affr2.j((Iterable)aqep.a());
            CommandOuterClass$GestureOptions commandOuterClass$GestureOptions;
            if ((commandOuterClass$GestureOptions = aqdt.b.g) == null) {
                commandOuterClass$GestureOptions = CommandOuterClass$GestureOptions.getDefaultInstance();
            }
            final aeea b3 = aqeq.b(commandOuterClass$GestureOptions);
            final vfp a3 = aqdt.a;
            affr2.j((Iterable)b3.A().a());
            CommandOuterClass$GestureOptions commandOuterClass$GestureOptions2;
            if ((commandOuterClass$GestureOptions2 = aqdt.b.h) == null) {
                commandOuterClass$GestureOptions2 = CommandOuterClass$GestureOptions.getDefaultInstance();
            }
            final aeea b4 = aqeq.b(commandOuterClass$GestureOptions2);
            final vfp a4 = aqdt.a;
            affr2.j((Iterable)b4.A().a());
            affr.j((Iterable)affr2.g());
        }
        final afel afel2 = new afel();
        final Iterator<Object> iterator2 = ((List<Object>)this.b.f).iterator();
        while (iterator2.hasNext()) {
            afel2.h(new aqdw((aqee)((ahaz)((ahbh)iterator2.next()).toBuilder()).build(), this.a));
        }
        final afkf d2 = afel2.g().D();
        while (((Iterator)d2).hasNext()) {
            final aqdw aqdw = (aqdw)((Iterator)d2).next();
            final affr affr3 = new affr();
            aqed aqed;
            if ((aqed = aqdw.b.i) == null) {
                aqed = aqed.a;
            }
            final ahaz builder = aqed.toBuilder();
            final vfp a5 = aqdw.a;
            final aqdv aqdv = new aqdv((aqed)builder.build());
            final affr affr4 = new affr();
            final aqed a6 = aqdv.a;
            aqec a7;
            if (a6.b == 2) {
                a7 = (aqec)a6.c;
            }
            else {
                a7 = aqec.a;
            }
            final aqec aqec = (aqec)a7.toBuilder().build();
            affr4.j((Iterable)new affr().g());
            affr3.j((Iterable)affr4.g());
            aqef aqef;
            if ((aqef = aqdw.b.n) == null) {
                aqef = aqef.a;
            }
            final ahbb ahbb = (ahbb)((ahbh)aqef).toBuilder();
            final vfp a8 = aqdw.a;
            final aqef aqef2 = (aqef)((ahaz)ahbb).build();
            affr3.j((Iterable)new affr().g());
            affr.j((Iterable)affr3.g());
        }
        final afel afel3 = new afel();
        final Iterator<Object> iterator3 = ((List<Object>)this.b.g).iterator();
        while (iterator3.hasNext()) {
            afel3.h(new aqdr((aqdx)((ahaz)((ahbh)iterator3.next()).toBuilder()).build()));
        }
        final afkf d3 = afel3.g().D();
        while (((Iterator)d3).hasNext()) {
            final aqdr aqdr = (aqdr)((Iterator)d3).next();
            affr.j((Iterable)new affr().g());
        }
        final afel afel4 = new afel();
        final Iterator<Object> iterator4 = ((List<Object>)this.b.h).iterator();
        while (iterator4.hasNext()) {
            afel4.h(new aqdu((aqea)iterator4.next().toBuilder().build(), this.a));
        }
        final afkf d4 = afel4.g().D();
        while (((Iterator)d4).hasNext()) {
            final aqdu aqdu = (aqdu)((Iterator)d4).next();
            final affr affr5 = new affr();
            aqeg aqeg;
            if ((aqeg = aqdu.b.b) == null) {
                aqeg = aqeg.a;
            }
            final ahbb ahbb2 = (ahbb)((ahbh)aqeg).toBuilder();
            final vfp a9 = aqdu.a;
            final aqeg aqeg2 = (aqeg)((ahaz)ahbb2).build();
            affr5.j((Iterable)new affr().g());
            affr.j((Iterable)affr5.g());
        }
        aqeb aqeb;
        if ((aqeb = this.b.i) == null) {
            aqeb = aqeb.a;
        }
        final aqeb aqeb2 = (aqeb)aqeb.toBuilder().build();
        affr.j((Iterable)new affr().g());
        return affr.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqds && this.b.equals((Object)((aqds)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AttributedStringModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
