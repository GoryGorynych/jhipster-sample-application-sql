export interface IAuthor {
  id?: number;
  fullName?: string | null;
  birthYear?: number | null;
  deathyear?: number | null;
  birthcountry?: string | null;
}

export const defaultValue: Readonly<IAuthor> = {};
