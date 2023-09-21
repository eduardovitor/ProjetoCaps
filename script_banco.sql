create database caps;

use caps;

create table funcionario(nome varchar(50), dias_trabalha varchar(50), CPF_func int primary key
not null );

create table medico(CRM int primary key not null , cpf_fk_func_med int);

alter table medico add constraint cpf_fk_func_med foreign key(cpf_fk_func_med) references
funcionario (CPF_func);

create table psicologo(CRP int primary key not null , cpf_fk_func_psi int);

alter table psicologo add constraint cpf_fk_func_psi foreign key(cpf_fk_func_psi) references
funcionario (CPF_func);

create table enfermeiro(COREN int primary key not null , cpf_fk_func_enf int);

alter table enfermeiro add constraint cpf_fk_func_enf foreign key(cpf_fk_func_enf) references
funcionario (CPF_func);

create table paciente(CPF_pac int primary key not null , nome varchar(50), nome_mae
varchar(50), participa_atividades varchar(10), crm_medico int, crp_psicologo int);

alter table paciente add constraint crm_medico foreign key(crm_medico) references medico
(CRM);

alter table paciente add constraint crp_psicologo foreign key(crp_psicologo) references
psicologo (CRP);

create table telefone_paciente(telefone bigint(20), cpf_fk_paciente_tel int);

alter table telefone_paciente add constraint cpf_fk_paciente_tel foreign key(cpf_fk_paciente_tel)
references paciente(CPF_pac);

alter table telefone_paciente add constraint pk_telefone_paciente primary key(telefone,
cpf_fk_paciente_tel);

create table medicamento_paciente(medicamento varchar(70),cpf_fk_paciente_med int);

alter table medicamento_paciente add constraint cpf_fk2_paciente foreign
key(cpf_fk_paciente_med) references paciente(CPF_pac);

alter table medicamento_paciente add constraint pk_medicamento_paciente primary
key(medicamento, cpf_fk_paciente_med);

create table paciente_medico(cpf_fk_paciente1 int, crm_fk_medico int, observacoes_consulta
text, data_atendimento date, levou_remedio varchar(3), tipo_atendimento varchar(20));

alter table paciente_medico add constraint fk_paciente_1 foreign key(cpf_fk_paciente1)
references paciente(CPF_pac);

alter table paciente_medico add constraint crm_fk_medico foreign key(crm_fk_medico)
references medico(CRM);

alter table paciente_medico add constraint pk_paciente_medico primary key(cpf_fk_paciente1,
crm_fk_medico);

create table paciente_psicologo(cpf_fk_paciente2 int, crp_fk_psicologo int,
observacoes_consulta text, data_atendimento date, levou_remedio varchar(3),
tipo_atendimento varchar(20));

alter table paciente_psicologo add constraint fk_paciente_2 foreign key(cpf_fk_paciente2)
references paciente(CPF_pac);

alter table paciente_psicologo add constraint crp_fk_psicologo foreign key(crp_fk_psicologo)
references psicologo(CRP);

alter table paciente_psicologo add constraint pk_paciente_psicologo primary
key(cpf_fk_paciente2, crp_fk_psicologo);

create table paciente_enfermeiro(cpf_fk_paciente3 int, coren_fk_enfermeiro int,
observacoes_consulta text, data_atendimento date, levou_remedio varchar(3),
tipo_atendimento varchar(20));

alter table paciente_enfermeiro add constraint fk_paciente_3 foreign key(cpf_fk_paciente3)
references paciente(CPF_pac);

alter table paciente_enfermeiro add constraint coren_fk_enfermeiro foreign
key(coren_fk_enfermeiro) references enfermeiro(COREN);

alter table paciente_enfermeiro add constraint pk_paciente_enfermeiro primary
key(cpf_fk_paciente3, coren_fk_enfermeiro);


