package br.com.cursorandroid.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView lvSignos;

    private String[] signos = {"Áries", "Touro", "Gêmeos",
                               "Cancêr","Leão", "Virgem",
                               "Libra", "Escorpião", "Sargitário",
                               "Capricórnio", "Aquário", "Peixes"};

    private String[] perfis = {
        "Neste domingo, os astros favorecem assuntos ligados às finanças. Aproveite para rever seus gastos, cortar algumas coisas e descobrir novas maneiras de economizar. Se realmente confia no seu amor, a paixão vai pegar fogo! Cor: coral.",
        "Com a Lua em seu signo, o domingo promete animação e alto-astral! O contato e a convivência com os amigos e pessoas queridas deixam a tarde ainda mais gostosa. O romance ganha mais emoção e vocês ficarão mais próximos. Cor: branco.",
        "O dia pede mais sossego. Se tiver a chance de se isolar um pouco e repensar algumas coisas, vá em frente. Diminuir o ritmo ajuda a preservar sua energia, mas não é obrigatório. Já o romance pede calma e confiança. Cor: ouro.",
        "Bom dia para passear e conhecer lugares diferentes. Se for na companhia dos amigos, melhor ainda! Programa com a turma tem tudo para animar a sua vida amorosa -- pode se encantar com um paquera que conheceu através de um amigo. Cor: cinza.",
            "Vale a pena fazer grandes planos, ainda mais se já vinha pensando em mexer em alguma coisa em casa. Vale a pena comprar alguma coisa para o lar e deixar tudo do seu jeito. Você e o par podem assumir novas responsabilidades. Cor: marinho.",
            "Explore seu espírito aventureiro, que estará em alta, e deixe a mesmice bem longe neste domingo. Viagem, passeio ou até conversa com alguém que está longe deve animar o dia. Uma dose extra de bom humor agita a vida a dois. Cor: verde.",
            "Quem pensa em abandonar um antigo hábito e cuidar melhor da saúde conta com ajuda extra das estrelas. Aproveite também para se livrar de alguns gastos extras. A sensualidade se torna mais acentuada e o desejo deixa a vida amorosa muito melhor! Cor: gelo.",
            "DOM - A Lua traz à tona seu lado mais companheiro e preocupado com o próximo. Deixe a solidão bem longe, valorize seus relacionamentos e aproveite para aprofundar esses laços. Contato com crianças ou filhos recebe as melhores energias! Você vai fazer o possível para mostrar ao par o quanto se importa com esse romance. Capriche no romantismo! Namoro ou rolo tem tudo para se firmar. Cor: preto.",
            "Não falta energia para terminar tarefas pendentes, ainda mais se for algo no seu lar. Aproveite para dar mais atenção à sua saúde e praticar exercícios. Há chance de se interessar por alguém próximo, mas talvez a pessoa seja comprometida. Cor: vinho.",
            "Com a Lua brilhando em seu paraíso astral, vai esbanjar bom humor, carisma e animação por onde passar! Bom momento para priorizar atividades divertidas e fora da rotina. A dois, declaração de amor aquece a relação. Cor: dourado.",
            "Neste domingo, seu lado família fica mais evidente. Passar mais tempo em casa e curtir os parentes será a melhor pedida! Vale a pena traçar planos ambiciosos para a sua casa. Na relação, demonstre seu carinho com mimos e muito apoio. Cor: prata.",
            "Aproveite para sair de casa, circular por aí, conhecer pessoas e colocar o papo em dia. Viagem, seja rápida ou longa, também pode animar este domingo. Muito diálogo e sinceridade são as melhores armas para encantar o amor. Cor: turquesa."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSignos = (ListView) findViewById(R.id.lvSignos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, signos);
        lvSignos.setAdapter(adapter);

        lvSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, perfis[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
